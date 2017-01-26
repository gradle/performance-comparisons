package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_244 {
    private final Production46_244 production = new Production46_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}