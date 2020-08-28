import pygame
from pygame.locals import *


def rule():

    pygame.init()

    SURFACE = pygame.display.set_mode((800, 600), 0, 32)
    pygame.display.set_caption('D   I   C   E   R   S')

    GRAY = (180, 180, 180)
    WHITE = (250, 250, 250)
    RED = (200, 0, 0)

    DICERSFONT = 'material//NEXONFootballGothicL.ttf'
    MAINFONT = pygame.font.Font(DICERSFONT, 25)

    GO_SURFACE = MAINFONT.render('click to play!', True, GRAY)
    GO_RECT = GO_SURFACE.get_rect(center=[450, 550])

    NEXT_SURFACE = MAINFONT.render('NEXT ->', True, RED)
    NEXT_RECT = NEXT_SURFACE.get_rect(center=[640, 550])

    RULE_IMG = pygame.image.load('material//rule1.png')
    RULE_IMG2 = pygame.image.load('material//rule2.png')
    RULE_IMG3 = pygame.image.load('material//rule3.png')
    RULE_IMG4 = pygame.image.load('material//rule4.png')


    RULE_POS = (40, 40)

    while True:

        events = pygame.event.get()
        SURFACE.fill(WHITE)
        SURFACE.blit(RULE_IMG, RULE_POS)
        SURFACE.blit(NEXT_SURFACE, NEXT_RECT)

        for event in events:
            if event.type == QUIT:
                pygame.quit()

            if event.type == pygame.MOUSEBUTTONDOWN:
                if NEXT_RECT.collidepoint(event.pos):
                    RULE_IMG = RULE_IMG2
                    pygame.display.update()
                    if NEXT_RECT.collidepoint(event.pos):
                        RULE_IMG = RULE_IMG3
                        pygame.display.update()
                        if NEXT_RECT.collidepoint(event.pos):
                            RULE_IMG = RULE_IMG4
                            pygame.display.update()
                        pygame.display.update()