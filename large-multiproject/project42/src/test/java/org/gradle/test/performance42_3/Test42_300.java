package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_300 {
    private final Production42_300 production = new Production42_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}