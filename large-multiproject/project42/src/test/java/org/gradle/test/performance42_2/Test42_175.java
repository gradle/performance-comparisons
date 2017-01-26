package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_175 {
    private final Production42_175 production = new Production42_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}