package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_8 {
    private final Production86_8 production = new Production86_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}