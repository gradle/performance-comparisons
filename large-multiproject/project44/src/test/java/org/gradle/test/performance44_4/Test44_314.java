package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_314 {
    private final Production44_314 production = new Production44_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}