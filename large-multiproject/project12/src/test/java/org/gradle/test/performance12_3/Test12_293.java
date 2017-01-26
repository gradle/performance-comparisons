package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_293 {
    private final Production12_293 production = new Production12_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}