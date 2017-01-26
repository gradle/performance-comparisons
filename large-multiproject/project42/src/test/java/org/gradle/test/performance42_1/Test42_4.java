package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_4 {
    private final Production42_4 production = new Production42_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}