package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_378 {
    private final Production27_378 production = new Production27_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}