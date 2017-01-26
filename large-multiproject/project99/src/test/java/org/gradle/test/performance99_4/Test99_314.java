package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_314 {
    private final Production99_314 production = new Production99_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}