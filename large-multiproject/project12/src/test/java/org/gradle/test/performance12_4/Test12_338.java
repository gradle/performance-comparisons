package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_338 {
    private final Production12_338 production = new Production12_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}