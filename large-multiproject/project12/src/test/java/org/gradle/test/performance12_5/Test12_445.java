package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_445 {
    private final Production12_445 production = new Production12_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}