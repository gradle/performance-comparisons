package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_500 {
    private final Production50_500 production = new Production50_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}