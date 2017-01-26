package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_422 {
    private final Production42_422 production = new Production42_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}