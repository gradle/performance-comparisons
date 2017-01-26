package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_361 {
    private final Production42_361 production = new Production42_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}