package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_413 {
    private final Production97_413 production = new Production97_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}