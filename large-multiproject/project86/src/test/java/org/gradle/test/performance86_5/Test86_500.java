package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_500 {
    private final Production86_500 production = new Production86_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}