package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_314 {
    private final Production74_314 production = new Production74_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}