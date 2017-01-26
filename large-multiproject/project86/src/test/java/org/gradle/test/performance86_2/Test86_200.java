package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_200 {
    private final Production86_200 production = new Production86_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}