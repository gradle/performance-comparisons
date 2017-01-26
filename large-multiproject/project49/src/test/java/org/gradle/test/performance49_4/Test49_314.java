package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_314 {
    private final Production49_314 production = new Production49_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}