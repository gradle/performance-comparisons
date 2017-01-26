package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_488 {
    private final Production42_488 production = new Production42_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}