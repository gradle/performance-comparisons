package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_22 {
    private final Production97_22 production = new Production97_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}