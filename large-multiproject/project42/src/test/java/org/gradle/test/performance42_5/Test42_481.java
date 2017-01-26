package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_481 {
    private final Production42_481 production = new Production42_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}