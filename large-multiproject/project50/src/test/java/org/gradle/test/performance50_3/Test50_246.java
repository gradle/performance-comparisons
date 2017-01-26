package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_246 {
    private final Production50_246 production = new Production50_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}