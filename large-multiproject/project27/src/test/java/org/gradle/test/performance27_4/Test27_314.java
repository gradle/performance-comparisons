package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_314 {
    private final Production27_314 production = new Production27_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}