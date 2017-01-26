package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_99 {
    private final Production50_99 production = new Production50_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}