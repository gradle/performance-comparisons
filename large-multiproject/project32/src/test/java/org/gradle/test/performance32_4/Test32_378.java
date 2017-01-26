package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_378 {
    private final Production32_378 production = new Production32_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}