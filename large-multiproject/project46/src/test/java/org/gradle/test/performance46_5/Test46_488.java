package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_488 {
    private final Production46_488 production = new Production46_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}