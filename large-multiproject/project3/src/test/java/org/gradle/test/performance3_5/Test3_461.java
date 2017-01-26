package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_461 {
    private final Production3_461 production = new Production3_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}