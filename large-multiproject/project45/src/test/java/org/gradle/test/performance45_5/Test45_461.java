package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_461 {
    private final Production45_461 production = new Production45_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}