package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_325 {
    private final Production86_325 production = new Production86_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}