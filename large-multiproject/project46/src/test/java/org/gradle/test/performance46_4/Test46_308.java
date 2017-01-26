package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_308 {
    private final Production46_308 production = new Production46_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}