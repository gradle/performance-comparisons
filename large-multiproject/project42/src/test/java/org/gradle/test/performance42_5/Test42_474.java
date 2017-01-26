package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_474 {
    private final Production42_474 production = new Production42_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}