package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_210 {
    private final Production42_210 production = new Production42_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}