package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_244 {
    private final Production42_244 production = new Production42_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}