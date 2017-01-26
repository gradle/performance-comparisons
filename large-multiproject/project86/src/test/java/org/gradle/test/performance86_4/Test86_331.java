package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_331 {
    private final Production86_331 production = new Production86_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}