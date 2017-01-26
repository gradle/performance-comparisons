package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_102 {
    private final Production5_102 production = new Production5_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}