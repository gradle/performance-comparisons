package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_146 {
    private final Production46_146 production = new Production46_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}