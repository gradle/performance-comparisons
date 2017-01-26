package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_342 {
    private final Production46_342 production = new Production46_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}