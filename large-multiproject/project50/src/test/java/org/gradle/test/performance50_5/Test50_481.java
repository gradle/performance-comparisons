package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_481 {
    private final Production50_481 production = new Production50_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}