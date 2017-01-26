package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_376 {
    private final Production97_376 production = new Production97_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}