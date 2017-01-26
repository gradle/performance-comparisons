package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_102 {
    private final Production88_102 production = new Production88_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}