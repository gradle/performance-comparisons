package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_6 {
    private final Production46_6 production = new Production46_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}