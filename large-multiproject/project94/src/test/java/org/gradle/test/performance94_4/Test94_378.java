package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_378 {
    private final Production94_378 production = new Production94_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}