package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_31 {
    private final Production46_31 production = new Production46_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}