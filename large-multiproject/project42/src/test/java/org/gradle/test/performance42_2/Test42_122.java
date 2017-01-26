package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_122 {
    private final Production42_122 production = new Production42_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}