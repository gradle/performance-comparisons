package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_334 {
    private final Production42_334 production = new Production42_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}