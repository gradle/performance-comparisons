package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_30 {
    private final Production46_30 production = new Production46_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}