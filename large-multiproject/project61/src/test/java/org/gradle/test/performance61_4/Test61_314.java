package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_314 {
    private final Production61_314 production = new Production61_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}