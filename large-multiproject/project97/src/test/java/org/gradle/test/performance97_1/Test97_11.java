package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_11 {
    private final Production97_11 production = new Production97_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}