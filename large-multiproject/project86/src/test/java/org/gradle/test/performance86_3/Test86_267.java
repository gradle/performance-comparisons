package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_267 {
    private final Production86_267 production = new Production86_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}