package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_162 {
    private final Production46_162 production = new Production46_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}