package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_172 {
    private final Production12_172 production = new Production12_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}