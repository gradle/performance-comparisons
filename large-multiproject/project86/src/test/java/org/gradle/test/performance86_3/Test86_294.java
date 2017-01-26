package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_294 {
    private final Production86_294 production = new Production86_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}