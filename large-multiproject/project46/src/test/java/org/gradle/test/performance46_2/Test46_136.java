package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_136 {
    private final Production46_136 production = new Production46_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}