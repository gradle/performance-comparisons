package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_329 {
    private final Production42_329 production = new Production42_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}