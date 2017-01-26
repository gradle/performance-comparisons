package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_161 {
    private final Production46_161 production = new Production46_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}