package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_424 {
    private final Production20_424 production = new Production20_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}