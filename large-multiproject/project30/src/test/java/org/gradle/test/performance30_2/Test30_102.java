package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_102 {
    private final Production30_102 production = new Production30_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}