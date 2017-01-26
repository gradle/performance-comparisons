package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_57 {
    private final Production46_57 production = new Production46_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}