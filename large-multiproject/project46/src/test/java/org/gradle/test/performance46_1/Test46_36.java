package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_36 {
    private final Production46_36 production = new Production46_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}