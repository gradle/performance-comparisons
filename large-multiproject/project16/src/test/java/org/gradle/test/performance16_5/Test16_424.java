package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_424 {
    private final Production16_424 production = new Production16_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}