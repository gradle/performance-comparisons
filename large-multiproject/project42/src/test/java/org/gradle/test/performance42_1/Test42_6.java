package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_6 {
    private final Production42_6 production = new Production42_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}