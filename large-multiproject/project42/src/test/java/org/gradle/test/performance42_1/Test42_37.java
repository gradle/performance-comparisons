package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_37 {
    private final Production42_37 production = new Production42_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}