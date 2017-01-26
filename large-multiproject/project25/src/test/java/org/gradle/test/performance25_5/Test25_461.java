package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_461 {
    private final Production25_461 production = new Production25_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}