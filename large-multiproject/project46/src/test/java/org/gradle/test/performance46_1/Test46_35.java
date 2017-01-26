package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_35 {
    private final Production46_35 production = new Production46_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}