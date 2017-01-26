package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_314 {
    private final Production26_314 production = new Production26_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}