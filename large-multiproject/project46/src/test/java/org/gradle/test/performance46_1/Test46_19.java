package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_19 {
    private final Production46_19 production = new Production46_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}