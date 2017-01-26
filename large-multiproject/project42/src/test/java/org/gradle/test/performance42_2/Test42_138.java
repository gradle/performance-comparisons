package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_138 {
    private final Production42_138 production = new Production42_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}