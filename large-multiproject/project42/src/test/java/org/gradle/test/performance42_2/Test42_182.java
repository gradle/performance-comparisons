package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_182 {
    private final Production42_182 production = new Production42_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}