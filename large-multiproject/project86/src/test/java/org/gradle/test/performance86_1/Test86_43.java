package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_43 {
    private final Production86_43 production = new Production86_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}