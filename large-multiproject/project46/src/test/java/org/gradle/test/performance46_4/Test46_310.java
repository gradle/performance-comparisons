package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_310 {
    private final Production46_310 production = new Production46_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}