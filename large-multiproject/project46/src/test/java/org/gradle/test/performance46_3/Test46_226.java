package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_226 {
    private final Production46_226 production = new Production46_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}