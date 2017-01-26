package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_424 {
    private final Production7_424 production = new Production7_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}