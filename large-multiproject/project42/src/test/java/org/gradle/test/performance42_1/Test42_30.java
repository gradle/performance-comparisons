package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_30 {
    private final Production42_30 production = new Production42_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}