package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_27 {
    private final Production50_27 production = new Production50_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}