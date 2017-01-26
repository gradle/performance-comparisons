package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_98 {
    private final Production86_98 production = new Production86_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}