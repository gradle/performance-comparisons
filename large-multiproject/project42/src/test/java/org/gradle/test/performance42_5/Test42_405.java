package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_405 {
    private final Production42_405 production = new Production42_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}