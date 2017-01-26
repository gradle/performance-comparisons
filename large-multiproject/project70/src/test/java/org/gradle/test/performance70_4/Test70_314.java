package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_314 {
    private final Production70_314 production = new Production70_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}