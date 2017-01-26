package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_154 {
    private final Production42_154 production = new Production42_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}