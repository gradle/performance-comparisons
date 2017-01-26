package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_161 {
    private final Production50_161 production = new Production50_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}