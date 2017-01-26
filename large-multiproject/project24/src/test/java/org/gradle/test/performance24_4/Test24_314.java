package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_314 {
    private final Production24_314 production = new Production24_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}