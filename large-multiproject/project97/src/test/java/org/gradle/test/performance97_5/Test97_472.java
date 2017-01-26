package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_472 {
    private final Production97_472 production = new Production97_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}