package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_142 {
    private final Production46_142 production = new Production46_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}