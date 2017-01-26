package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_225 {
    private final Production50_225 production = new Production50_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}