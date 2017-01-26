package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_39 {
    private final Production46_39 production = new Production46_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}