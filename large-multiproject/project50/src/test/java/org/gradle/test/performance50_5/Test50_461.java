package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_461 {
    private final Production50_461 production = new Production50_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}