package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_204 {
    private final Production42_204 production = new Production42_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}