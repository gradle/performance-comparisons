package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_40 {
    private final Production86_40 production = new Production86_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}