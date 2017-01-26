package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_468 {
    private final Production50_468 production = new Production50_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}