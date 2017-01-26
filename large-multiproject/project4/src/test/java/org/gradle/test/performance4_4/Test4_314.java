package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_314 {
    private final Production4_314 production = new Production4_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}