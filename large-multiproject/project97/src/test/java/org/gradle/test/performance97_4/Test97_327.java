package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_327 {
    private final Production97_327 production = new Production97_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}