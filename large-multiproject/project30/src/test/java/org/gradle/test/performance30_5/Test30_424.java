package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_424 {
    private final Production30_424 production = new Production30_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}