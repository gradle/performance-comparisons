package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_378 {
    private final Production95_378 production = new Production95_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}