package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_102 {
    private final Production7_102 production = new Production7_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}