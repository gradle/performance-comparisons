package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_54 {
    private final Production46_54 production = new Production46_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}