package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_444 {
    private final Production42_444 production = new Production42_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}