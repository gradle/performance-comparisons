package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_350 {
    private final Production42_350 production = new Production42_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}