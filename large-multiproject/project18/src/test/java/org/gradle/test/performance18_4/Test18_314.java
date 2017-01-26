package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_314 {
    private final Production18_314 production = new Production18_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}