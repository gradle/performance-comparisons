package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_76 {
    private final Production12_76 production = new Production12_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}