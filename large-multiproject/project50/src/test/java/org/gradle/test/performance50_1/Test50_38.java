package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_38 {
    private final Production50_38 production = new Production50_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}