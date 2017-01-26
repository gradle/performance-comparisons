package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_5 {
    private final Production46_5 production = new Production46_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}