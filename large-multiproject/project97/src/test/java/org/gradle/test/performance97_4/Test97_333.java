package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_333 {
    private final Production97_333 production = new Production97_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}