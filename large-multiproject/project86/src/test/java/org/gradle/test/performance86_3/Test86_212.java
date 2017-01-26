package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_212 {
    private final Production86_212 production = new Production86_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}