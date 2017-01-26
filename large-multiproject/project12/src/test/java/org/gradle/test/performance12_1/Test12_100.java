package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_100 {
    private final Production12_100 production = new Production12_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}