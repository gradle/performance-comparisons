package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_424 {
    private final Production18_424 production = new Production18_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}