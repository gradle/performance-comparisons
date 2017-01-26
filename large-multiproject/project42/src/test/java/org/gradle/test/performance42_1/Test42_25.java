package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_25 {
    private final Production42_25 production = new Production42_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}