package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_220 {
    private final Production86_220 production = new Production86_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}