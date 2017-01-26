package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_15 {
    private final Production42_15 production = new Production42_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}