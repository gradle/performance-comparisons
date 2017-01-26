package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_497 {
    private final Production42_497 production = new Production42_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}