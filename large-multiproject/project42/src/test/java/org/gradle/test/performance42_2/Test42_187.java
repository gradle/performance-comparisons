package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_187 {
    private final Production42_187 production = new Production42_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}