package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_314 {
    private final Production90_314 production = new Production90_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}