package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_52 {
    private final Production46_52 production = new Production46_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}