package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_137 {
    private final Production86_137 production = new Production86_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}