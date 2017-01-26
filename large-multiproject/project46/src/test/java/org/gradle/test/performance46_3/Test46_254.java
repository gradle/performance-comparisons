package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_254 {
    private final Production46_254 production = new Production46_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}