package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_446 {
    private final Production97_446 production = new Production97_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}