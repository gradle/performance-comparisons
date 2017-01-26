package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_371 {
    private final Production42_371 production = new Production42_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}