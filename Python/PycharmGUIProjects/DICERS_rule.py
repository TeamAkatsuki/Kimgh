import pygame, sys
from pygame.locals import *

def game_1():

    pygame.init()

    SURFACE = pygame.display.set_mode((800, 600), 0, 32)
    pygame.display.set_caption('D   I   C   E   R   S')

    BLACK = (50, 50, 50)
    WHITE = (250, 250, 250)
    RED = (200, 0, 0)

    BOX = (30, 30, 740, 500)

    DICERSFONT = 'material//NEXONFootballGothicL.ttf'
    MAINFONT = pygame.font.Font(DICERSFONT, 25)

    BACK_SURFACE = MAINFONT.render('back to menu', True, BLACK)
    BACK_RECT = BACK_SURFACE.get_rect(center=[675, 550])

    GO_SURFACE = MAINFONT.render('(click to play) L E T\' S  R O L L', True, BLACK)
    GO_RECT = GO_SURFACE.get_rect(center=[565, 510])

    RULE_IMG = pygame.image.load('material//rule.png')
    RULE_POS = (40, 40)




    while True:

        events = pygame.event.get()
        SURFACE.fill(WHITE)
        pygame.draw.rect(SURFACE, BLACK, BOX, 3)
        SURFACE.blit(BACK_SURFACE, BACK_RECT)
        SURFACE.blit(GO_SURFACE, GO_RECT)
        SURFACE.blit(RULE_IMG, RULE_POS)

        for event in events:
            if event.type == QUIT:
                pygame.quit()

            if event.type == pygame.MOUSEMOTION:

                if GO_RECT.collidepoint(event.pos):
                    GO_SURFACE = MAINFONT.render('$ (click to play) L E T\' S  R O L L $', True, RED)
                    GO_RECT = GO_SURFACE.get_rect(center=[565, 510])
                    SURFACE.blit(GO_SURFACE, GO_RECT)

                elif BACK_RECT.collidepoint(event.pos):
                    BACK_SURFACE = MAINFONT.render('$ back to menu $', True, RED)
                    BACK_RECT = BACK_SURFACE.get_rect(center=[675, 550])
                    SURFACE.blit(BACK_SURFACE, BACK_RECT)

                else:
                    game_1()

            if event.type == pygame.MOUSEBUTTONDOWN:
                if BACK_RECT.collidepoint(event.pos):
                    import DICERS_main
                    DICERS_main.main()

                if GO_RECT.collidepoint(event.pos):
                    import DICERS_game
                    DICERS_game.game()

            pygame.display.update()