package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_468 {
    private final Production46_468 production = new Production46_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}