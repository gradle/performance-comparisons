package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_419 {
    private final Production42_419 production = new Production42_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}