package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_492 {
    private final Production46_492 production = new Production46_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}