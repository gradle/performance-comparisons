package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_223 {
    private final Production97_223 production = new Production97_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}