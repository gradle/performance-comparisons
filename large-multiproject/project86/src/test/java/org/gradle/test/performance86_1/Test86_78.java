package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_78 {
    private final Production86_78 production = new Production86_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}