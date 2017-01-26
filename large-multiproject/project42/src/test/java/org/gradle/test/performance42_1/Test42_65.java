package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_65 {
    private final Production42_65 production = new Production42_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}