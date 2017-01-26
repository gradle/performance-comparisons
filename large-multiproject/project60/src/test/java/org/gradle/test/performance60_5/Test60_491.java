package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_491 {
    private final Production60_491 production = new Production60_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}