package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_58 {
    private final Production86_58 production = new Production86_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}