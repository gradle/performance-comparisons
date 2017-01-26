package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_193 {
    private final Production46_193 production = new Production46_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}