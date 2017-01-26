package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_261 {
    private final Production46_261 production = new Production46_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}