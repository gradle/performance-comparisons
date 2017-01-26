package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_482 {
    private final Production46_482 production = new Production46_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}