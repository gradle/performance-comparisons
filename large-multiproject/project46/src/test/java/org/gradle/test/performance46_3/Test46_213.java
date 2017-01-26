package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_213 {
    private final Production46_213 production = new Production46_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}