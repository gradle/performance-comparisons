package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_378 {
    private final Production70_378 production = new Production70_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}