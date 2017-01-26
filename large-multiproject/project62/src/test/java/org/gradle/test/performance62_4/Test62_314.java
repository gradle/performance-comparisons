package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_314 {
    private final Production62_314 production = new Production62_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}