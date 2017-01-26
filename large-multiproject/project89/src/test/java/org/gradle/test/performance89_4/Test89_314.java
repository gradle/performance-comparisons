package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_314 {
    private final Production89_314 production = new Production89_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}