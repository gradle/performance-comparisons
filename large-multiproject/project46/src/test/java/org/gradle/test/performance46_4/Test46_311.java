package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_311 {
    private final Production46_311 production = new Production46_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}