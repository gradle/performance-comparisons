package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_402 {
    private final Production97_402 production = new Production97_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}