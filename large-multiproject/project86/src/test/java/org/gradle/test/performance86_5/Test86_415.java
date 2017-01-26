package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_415 {
    private final Production86_415 production = new Production86_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}