package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_436 {
    private final Production42_436 production = new Production42_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}