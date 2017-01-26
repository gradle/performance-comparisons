package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_322 {
    private final Production42_322 production = new Production42_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}