package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_427 {
    private final Production42_427 production = new Production42_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}