package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_260 {
    private final Production42_260 production = new Production42_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}