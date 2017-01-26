package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_461 {
    private final Production97_461 production = new Production97_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}