package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_297 {
    private final Production86_297 production = new Production86_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}