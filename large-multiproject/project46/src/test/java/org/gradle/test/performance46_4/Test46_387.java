package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_387 {
    private final Production46_387 production = new Production46_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}