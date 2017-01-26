package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_48 {
    private final Production42_48 production = new Production42_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}