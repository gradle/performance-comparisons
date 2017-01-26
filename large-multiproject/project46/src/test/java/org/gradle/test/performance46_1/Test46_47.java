package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_47 {
    private final Production46_47 production = new Production46_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}