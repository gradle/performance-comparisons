package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_314 {
    private final Production14_314 production = new Production14_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}