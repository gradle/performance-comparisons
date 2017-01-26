package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_378 {
    private final Production2_378 production = new Production2_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}