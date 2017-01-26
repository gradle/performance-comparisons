package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_114 {
    private final Production46_114 production = new Production46_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}