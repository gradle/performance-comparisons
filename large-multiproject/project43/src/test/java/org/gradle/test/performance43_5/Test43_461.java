package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_461 {
    private final Production43_461 production = new Production43_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}