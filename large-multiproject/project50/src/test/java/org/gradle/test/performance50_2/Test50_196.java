package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_196 {
    private final Production50_196 production = new Production50_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}