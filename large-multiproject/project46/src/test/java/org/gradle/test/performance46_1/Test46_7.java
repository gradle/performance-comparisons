package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_7 {
    private final Production46_7 production = new Production46_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}