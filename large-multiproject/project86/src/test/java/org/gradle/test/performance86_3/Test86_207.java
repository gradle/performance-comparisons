package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_207 {
    private final Production86_207 production = new Production86_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}