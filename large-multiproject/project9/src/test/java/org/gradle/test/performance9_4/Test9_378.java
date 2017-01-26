package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_378 {
    private final Production9_378 production = new Production9_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}