package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_357 {
    private final Production42_357 production = new Production42_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}