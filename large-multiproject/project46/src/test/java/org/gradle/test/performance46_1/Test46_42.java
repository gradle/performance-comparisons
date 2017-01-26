package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_42 {
    private final Production46_42 production = new Production46_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}