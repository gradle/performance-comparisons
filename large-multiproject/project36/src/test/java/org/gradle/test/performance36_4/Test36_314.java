package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_314 {
    private final Production36_314 production = new Production36_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}