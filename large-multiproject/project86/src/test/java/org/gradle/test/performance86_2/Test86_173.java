package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_173 {
    private final Production86_173 production = new Production86_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}