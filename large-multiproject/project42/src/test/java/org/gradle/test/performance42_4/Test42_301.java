package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_301 {
    private final Production42_301 production = new Production42_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}