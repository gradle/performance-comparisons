package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_267 {
    private final Production12_267 production = new Production12_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}