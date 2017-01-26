package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_55 {
    private final Production42_55 production = new Production42_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}