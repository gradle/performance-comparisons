package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_491 {
    private final Production44_491 production = new Production44_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}