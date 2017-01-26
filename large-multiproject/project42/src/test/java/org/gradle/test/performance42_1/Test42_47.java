package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_47 {
    private final Production42_47 production = new Production42_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}