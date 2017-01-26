package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_323 {
    private final Production42_323 production = new Production42_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}