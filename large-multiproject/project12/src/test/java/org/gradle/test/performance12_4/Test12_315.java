package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_315 {
    private final Production12_315 production = new Production12_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}