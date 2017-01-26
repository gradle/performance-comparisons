package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_395 {
    private final Production42_395 production = new Production42_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}