package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_198 {
    private final Production46_198 production = new Production46_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}