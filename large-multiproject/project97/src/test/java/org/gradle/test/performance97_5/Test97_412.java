package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_412 {
    private final Production97_412 production = new Production97_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}