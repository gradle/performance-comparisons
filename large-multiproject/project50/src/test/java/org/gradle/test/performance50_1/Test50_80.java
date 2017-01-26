package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_80 {
    private final Production50_80 production = new Production50_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}