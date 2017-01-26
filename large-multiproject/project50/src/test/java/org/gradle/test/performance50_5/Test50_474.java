package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_474 {
    private final Production50_474 production = new Production50_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}