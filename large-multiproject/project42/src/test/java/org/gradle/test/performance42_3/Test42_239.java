package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_239 {
    private final Production42_239 production = new Production42_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}