package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_466 {
    private final Production50_466 production = new Production50_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}