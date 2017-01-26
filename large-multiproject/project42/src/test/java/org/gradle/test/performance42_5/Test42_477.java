package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_477 {
    private final Production42_477 production = new Production42_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}