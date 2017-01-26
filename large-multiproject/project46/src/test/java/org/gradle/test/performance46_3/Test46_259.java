package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_259 {
    private final Production46_259 production = new Production46_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}