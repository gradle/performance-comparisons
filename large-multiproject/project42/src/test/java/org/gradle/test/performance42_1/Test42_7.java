package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_7 {
    private final Production42_7 production = new Production42_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}