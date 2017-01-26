package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_188 {
    private final Production42_188 production = new Production42_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}