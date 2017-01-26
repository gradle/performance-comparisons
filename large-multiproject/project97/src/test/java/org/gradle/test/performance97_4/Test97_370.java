package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_370 {
    private final Production97_370 production = new Production97_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}