package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_127 {
    private final Production42_127 production = new Production42_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}