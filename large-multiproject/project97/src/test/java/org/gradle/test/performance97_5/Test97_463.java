package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_463 {
    private final Production97_463 production = new Production97_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}