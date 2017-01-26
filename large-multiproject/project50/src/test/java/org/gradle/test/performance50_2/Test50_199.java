package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_199 {
    private final Production50_199 production = new Production50_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}