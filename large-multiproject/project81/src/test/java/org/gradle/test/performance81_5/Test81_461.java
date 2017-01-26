package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_461 {
    private final Production81_461 production = new Production81_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}