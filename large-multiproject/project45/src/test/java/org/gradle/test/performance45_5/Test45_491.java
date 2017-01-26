package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_491 {
    private final Production45_491 production = new Production45_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}