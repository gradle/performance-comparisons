package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_33 {
    private final Production46_33 production = new Production46_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}