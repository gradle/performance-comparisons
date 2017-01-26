package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_271 {
    private final Production97_271 production = new Production97_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}