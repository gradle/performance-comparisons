package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_18 {
    private final Production42_18 production = new Production42_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}