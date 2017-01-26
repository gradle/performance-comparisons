package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_314 {
    private final Production21_314 production = new Production21_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}