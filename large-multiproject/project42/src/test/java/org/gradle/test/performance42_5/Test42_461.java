package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_461 {
    private final Production42_461 production = new Production42_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}