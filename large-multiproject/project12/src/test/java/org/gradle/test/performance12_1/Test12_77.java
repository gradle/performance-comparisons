package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_77 {
    private final Production12_77 production = new Production12_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}