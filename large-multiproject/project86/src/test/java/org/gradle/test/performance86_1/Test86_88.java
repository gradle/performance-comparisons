package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_88 {
    private final Production86_88 production = new Production86_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}