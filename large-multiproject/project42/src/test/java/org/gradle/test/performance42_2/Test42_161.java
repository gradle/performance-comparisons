package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_161 {
    private final Production42_161 production = new Production42_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}