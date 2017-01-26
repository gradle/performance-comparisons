package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_102 {
    private final Production31_102 production = new Production31_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}