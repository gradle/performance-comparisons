package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_2 {
    private final Production86_2 production = new Production86_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}