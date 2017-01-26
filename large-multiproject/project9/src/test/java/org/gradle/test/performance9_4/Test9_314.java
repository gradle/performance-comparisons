package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_314 {
    private final Production9_314 production = new Production9_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}