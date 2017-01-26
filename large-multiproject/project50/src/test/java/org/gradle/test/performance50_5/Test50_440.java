package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_440 {
    private final Production50_440 production = new Production50_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}