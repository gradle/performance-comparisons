package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_113 {
    private final Production42_113 production = new Production42_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}