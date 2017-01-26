package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_351 {
    private final Production46_351 production = new Production46_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}