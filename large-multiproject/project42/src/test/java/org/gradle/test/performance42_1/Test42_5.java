package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_5 {
    private final Production42_5 production = new Production42_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}