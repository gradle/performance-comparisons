package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_163 {
    private final Production86_163 production = new Production86_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}