package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_195 {
    private final Production12_195 production = new Production12_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}