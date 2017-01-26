package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_129 {
    private final Production46_129 production = new Production46_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}