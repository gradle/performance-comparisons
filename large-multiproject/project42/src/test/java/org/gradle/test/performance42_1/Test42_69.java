package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_69 {
    private final Production42_69 production = new Production42_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}