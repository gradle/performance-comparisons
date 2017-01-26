package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_242 {
    private final Production46_242 production = new Production46_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}