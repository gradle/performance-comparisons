package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_29 {
    private final Production50_29 production = new Production50_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}