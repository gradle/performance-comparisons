package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_102 {
    private final Production58_102 production = new Production58_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}