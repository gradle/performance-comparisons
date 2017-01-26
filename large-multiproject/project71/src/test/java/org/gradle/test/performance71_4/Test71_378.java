package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_378 {
    private final Production71_378 production = new Production71_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}