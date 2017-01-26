package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_337 {
    private final Production42_337 production = new Production42_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}