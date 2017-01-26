package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_358 {
    private final Production86_358 production = new Production86_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}