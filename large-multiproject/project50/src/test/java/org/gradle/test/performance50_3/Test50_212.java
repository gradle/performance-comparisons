package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_212 {
    private final Production50_212 production = new Production50_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}