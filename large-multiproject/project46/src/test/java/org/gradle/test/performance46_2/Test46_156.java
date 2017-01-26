package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_156 {
    private final Production46_156 production = new Production46_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}