package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_252 {
    private final Production46_252 production = new Production46_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}