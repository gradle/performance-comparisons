package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_1 {
    private final Production42_1 production = new Production42_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}