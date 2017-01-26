package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_63 {
    private final Production42_63 production = new Production42_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}