package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_255 {
    private final Production12_255 production = new Production12_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}