package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_230 {
    private final Production86_230 production = new Production86_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}