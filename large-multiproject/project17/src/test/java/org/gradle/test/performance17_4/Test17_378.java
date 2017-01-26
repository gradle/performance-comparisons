package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_378 {
    private final Production17_378 production = new Production17_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}