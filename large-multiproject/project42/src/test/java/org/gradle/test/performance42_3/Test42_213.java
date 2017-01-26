package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_213 {
    private final Production42_213 production = new Production42_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}