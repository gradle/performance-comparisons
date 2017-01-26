package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_31 {
    private final Production42_31 production = new Production42_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}