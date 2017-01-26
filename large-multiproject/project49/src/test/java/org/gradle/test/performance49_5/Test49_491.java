package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_491 {
    private final Production49_491 production = new Production49_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}