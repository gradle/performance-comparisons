package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_176 {
    private final Production42_176 production = new Production42_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}