package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_1 {
    private final Production46_1 production = new Production46_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}