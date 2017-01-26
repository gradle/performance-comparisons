package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_314 {
    private final Production67_314 production = new Production67_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}