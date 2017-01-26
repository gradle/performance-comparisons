package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_208 {
    private final Production46_208 production = new Production46_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}