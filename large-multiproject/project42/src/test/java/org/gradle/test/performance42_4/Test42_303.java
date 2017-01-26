package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_303 {
    private final Production42_303 production = new Production42_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}