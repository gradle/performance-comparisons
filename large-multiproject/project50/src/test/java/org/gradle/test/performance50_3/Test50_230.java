package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_230 {
    private final Production50_230 production = new Production50_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}