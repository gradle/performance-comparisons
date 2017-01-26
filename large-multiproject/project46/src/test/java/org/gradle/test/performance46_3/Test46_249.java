package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_249 {
    private final Production46_249 production = new Production46_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}