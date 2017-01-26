package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_68 {
    private final Production12_68 production = new Production12_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}