package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_314 {
    private final Production32_314 production = new Production32_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}