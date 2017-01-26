package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_228 {
    private final Production50_228 production = new Production50_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}