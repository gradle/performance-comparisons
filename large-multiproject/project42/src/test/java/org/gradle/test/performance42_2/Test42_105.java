package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_105 {
    private final Production42_105 production = new Production42_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}