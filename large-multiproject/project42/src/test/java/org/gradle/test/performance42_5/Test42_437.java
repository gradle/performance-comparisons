package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_437 {
    private final Production42_437 production = new Production42_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}