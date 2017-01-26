package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_90 {
    private final Production42_90 production = new Production42_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}