package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_140 {
    private final Production42_140 production = new Production42_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}