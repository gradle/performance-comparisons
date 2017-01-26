package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_51 {
    private final Production42_51 production = new Production42_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}