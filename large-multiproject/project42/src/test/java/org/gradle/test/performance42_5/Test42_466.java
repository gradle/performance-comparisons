package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_466 {
    private final Production42_466 production = new Production42_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}