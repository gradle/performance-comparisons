package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_81 {
    private final Production42_81 production = new Production42_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}