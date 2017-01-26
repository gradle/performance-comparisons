package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_112 {
    private final Production50_112 production = new Production50_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}