package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_131 {
    private final Production46_131 production = new Production46_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}