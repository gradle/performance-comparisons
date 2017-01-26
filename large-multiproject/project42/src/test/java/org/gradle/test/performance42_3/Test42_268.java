package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_268 {
    private final Production42_268 production = new Production42_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}