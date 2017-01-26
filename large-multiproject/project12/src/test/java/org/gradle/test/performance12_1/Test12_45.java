package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_45 {
    private final Production12_45 production = new Production12_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}