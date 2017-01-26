package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_102 {
    private final Production80_102 production = new Production80_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}