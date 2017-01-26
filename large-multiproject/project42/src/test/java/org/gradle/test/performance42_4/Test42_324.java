package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_324 {
    private final Production42_324 production = new Production42_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}