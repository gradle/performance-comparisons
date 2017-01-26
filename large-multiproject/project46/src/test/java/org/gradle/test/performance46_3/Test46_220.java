package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_220 {
    private final Production46_220 production = new Production46_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}