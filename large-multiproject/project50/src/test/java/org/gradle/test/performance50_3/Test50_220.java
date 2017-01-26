package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_220 {
    private final Production50_220 production = new Production50_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}