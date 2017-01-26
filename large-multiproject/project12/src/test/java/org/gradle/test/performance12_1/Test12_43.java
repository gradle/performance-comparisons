package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_43 {
    private final Production12_43 production = new Production12_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}