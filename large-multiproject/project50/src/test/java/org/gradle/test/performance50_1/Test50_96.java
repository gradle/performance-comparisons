package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_96 {
    private final Production50_96 production = new Production50_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}