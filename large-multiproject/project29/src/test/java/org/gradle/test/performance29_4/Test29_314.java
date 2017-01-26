package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_314 {
    private final Production29_314 production = new Production29_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}