package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_424 {
    private final Production5_424 production = new Production5_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}