package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_207 {
    private final Production12_207 production = new Production12_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}