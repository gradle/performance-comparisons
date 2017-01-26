package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_115 {
    private final Production46_115 production = new Production46_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}