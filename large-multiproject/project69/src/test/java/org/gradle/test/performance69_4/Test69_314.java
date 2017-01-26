package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_314 {
    private final Production69_314 production = new Production69_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}