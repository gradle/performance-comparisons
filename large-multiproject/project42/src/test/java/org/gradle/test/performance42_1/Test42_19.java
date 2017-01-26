package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_19 {
    private final Production42_19 production = new Production42_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}