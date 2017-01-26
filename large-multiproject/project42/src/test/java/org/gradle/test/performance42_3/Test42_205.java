package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_205 {
    private final Production42_205 production = new Production42_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}