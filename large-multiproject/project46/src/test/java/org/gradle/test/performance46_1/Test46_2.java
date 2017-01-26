package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_2 {
    private final Production46_2 production = new Production46_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}