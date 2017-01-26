package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_134 {
    private final Production86_134 production = new Production86_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}