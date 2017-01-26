package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_314 {
    private final Production38_314 production = new Production38_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}