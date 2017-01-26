package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_440 {
    private final Production46_440 production = new Production46_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}