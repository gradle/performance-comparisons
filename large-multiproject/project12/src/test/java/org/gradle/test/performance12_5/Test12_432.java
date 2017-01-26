package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_432 {
    private final Production12_432 production = new Production12_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}