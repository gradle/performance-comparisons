package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_344 {
    private final Production97_344 production = new Production97_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}