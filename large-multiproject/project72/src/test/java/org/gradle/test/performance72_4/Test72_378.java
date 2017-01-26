package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_378 {
    private final Production72_378 production = new Production72_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}