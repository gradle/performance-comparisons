package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_12 {
    private final Production42_12 production = new Production42_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}