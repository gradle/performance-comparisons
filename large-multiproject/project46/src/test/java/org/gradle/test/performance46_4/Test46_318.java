package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_318 {
    private final Production46_318 production = new Production46_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}