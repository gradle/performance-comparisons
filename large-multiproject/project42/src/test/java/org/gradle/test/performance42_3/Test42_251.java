package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_251 {
    private final Production42_251 production = new Production42_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}