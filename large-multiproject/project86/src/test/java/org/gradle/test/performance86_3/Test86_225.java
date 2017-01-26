package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_225 {
    private final Production86_225 production = new Production86_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}