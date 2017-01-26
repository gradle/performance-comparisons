package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_146 {
    private final Production42_146 production = new Production42_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}