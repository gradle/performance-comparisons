package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_8 {
    private final Production50_8 production = new Production50_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}