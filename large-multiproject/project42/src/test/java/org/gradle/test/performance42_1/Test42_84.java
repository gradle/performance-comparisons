package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_84 {
    private final Production42_84 production = new Production42_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}