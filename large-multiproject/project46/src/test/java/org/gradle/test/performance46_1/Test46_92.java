package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_92 {
    private final Production46_92 production = new Production46_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}