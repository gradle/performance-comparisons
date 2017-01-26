package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_237 {
    private final Production46_237 production = new Production46_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}