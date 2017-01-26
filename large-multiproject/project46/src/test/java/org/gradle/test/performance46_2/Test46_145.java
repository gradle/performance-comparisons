package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_145 {
    private final Production46_145 production = new Production46_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}