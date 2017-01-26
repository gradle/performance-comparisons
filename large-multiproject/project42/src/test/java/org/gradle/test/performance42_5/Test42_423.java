package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_423 {
    private final Production42_423 production = new Production42_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}