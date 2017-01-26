package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_232 {
    private final Production46_232 production = new Production46_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}