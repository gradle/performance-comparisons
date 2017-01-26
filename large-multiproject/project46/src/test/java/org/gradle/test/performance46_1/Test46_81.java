package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_81 {
    private final Production46_81 production = new Production46_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}