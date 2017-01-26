package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_396 {
    private final Production42_396 production = new Production42_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}