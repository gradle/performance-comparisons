package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_27 {
    private final Production12_27 production = new Production12_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}