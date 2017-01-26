package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_86 {
    private final Production46_86 production = new Production46_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}