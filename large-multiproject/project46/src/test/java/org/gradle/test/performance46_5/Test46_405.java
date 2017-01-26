package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_405 {
    private final Production46_405 production = new Production46_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}