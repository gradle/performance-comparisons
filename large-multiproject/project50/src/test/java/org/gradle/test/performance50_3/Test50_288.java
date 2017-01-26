package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_288 {
    private final Production50_288 production = new Production50_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}