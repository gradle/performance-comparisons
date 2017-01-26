package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_139 {
    private final Production42_139 production = new Production42_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}