package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_356 {
    private final Production12_356 production = new Production12_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}