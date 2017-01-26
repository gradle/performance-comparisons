package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_177 {
    private final Production46_177 production = new Production46_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}