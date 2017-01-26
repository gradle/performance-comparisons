package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_418 {
    private final Production50_418 production = new Production50_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}