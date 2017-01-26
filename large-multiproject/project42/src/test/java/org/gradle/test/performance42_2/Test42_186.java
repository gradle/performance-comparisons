package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_186 {
    private final Production42_186 production = new Production42_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}