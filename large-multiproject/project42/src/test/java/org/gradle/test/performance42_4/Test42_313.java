package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_313 {
    private final Production42_313 production = new Production42_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}