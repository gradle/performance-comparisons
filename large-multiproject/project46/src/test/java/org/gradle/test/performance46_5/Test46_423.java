package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_423 {
    private final Production46_423 production = new Production46_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}