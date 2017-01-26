package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_133 {
    private final Production42_133 production = new Production42_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}