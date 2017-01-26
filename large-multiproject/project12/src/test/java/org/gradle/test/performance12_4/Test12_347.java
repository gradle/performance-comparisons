package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_347 {
    private final Production12_347 production = new Production12_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}