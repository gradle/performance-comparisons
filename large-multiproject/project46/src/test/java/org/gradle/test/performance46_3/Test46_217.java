package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_217 {
    private final Production46_217 production = new Production46_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}