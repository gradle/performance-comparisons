package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_190 {
    private final Production46_190 production = new Production46_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}