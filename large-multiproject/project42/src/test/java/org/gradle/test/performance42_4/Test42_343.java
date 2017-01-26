package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_343 {
    private final Production42_343 production = new Production42_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}