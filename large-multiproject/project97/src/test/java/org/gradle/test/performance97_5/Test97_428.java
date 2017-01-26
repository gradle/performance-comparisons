package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_428 {
    private final Production97_428 production = new Production97_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}