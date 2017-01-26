package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_218 {
    private final Production46_218 production = new Production46_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}