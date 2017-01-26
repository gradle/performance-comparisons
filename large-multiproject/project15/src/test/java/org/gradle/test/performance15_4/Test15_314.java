package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_314 {
    private final Production15_314 production = new Production15_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}