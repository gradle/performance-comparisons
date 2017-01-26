package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_438 {
    private final Production97_438 production = new Production97_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}