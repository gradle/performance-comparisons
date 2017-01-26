package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_294 {
    private final Production50_294 production = new Production50_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}