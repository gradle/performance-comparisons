package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_458 {
    private final Production86_458 production = new Production86_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}