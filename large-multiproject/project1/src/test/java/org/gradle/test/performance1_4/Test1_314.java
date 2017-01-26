package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_314 {
    private final Production1_314 production = new Production1_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}