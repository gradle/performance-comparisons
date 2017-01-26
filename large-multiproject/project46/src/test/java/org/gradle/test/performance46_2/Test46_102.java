package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_102 {
    private final Production46_102 production = new Production46_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}