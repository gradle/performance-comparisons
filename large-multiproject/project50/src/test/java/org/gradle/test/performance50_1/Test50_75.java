package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_75 {
    private final Production50_75 production = new Production50_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}