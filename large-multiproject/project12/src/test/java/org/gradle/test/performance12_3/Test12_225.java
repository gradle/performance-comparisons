package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_225 {
    private final Production12_225 production = new Production12_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}