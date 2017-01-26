package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_461 {
    private final Production61_461 production = new Production61_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}