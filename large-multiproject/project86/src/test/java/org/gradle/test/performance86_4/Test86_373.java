package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_373 {
    private final Production86_373 production = new Production86_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}