package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_205 {
    private final Production46_205 production = new Production46_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}