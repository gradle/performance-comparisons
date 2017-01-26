package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_102 {
    private final Production48_102 production = new Production48_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}