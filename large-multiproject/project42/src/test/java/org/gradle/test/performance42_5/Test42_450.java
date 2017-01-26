package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_450 {
    private final Production42_450 production = new Production42_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}