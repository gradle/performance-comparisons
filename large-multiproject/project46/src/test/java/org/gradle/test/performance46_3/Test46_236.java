package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_236 {
    private final Production46_236 production = new Production46_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}