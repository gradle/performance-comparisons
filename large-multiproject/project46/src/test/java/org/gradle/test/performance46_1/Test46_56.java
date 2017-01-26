package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_56 {
    private final Production46_56 production = new Production46_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}