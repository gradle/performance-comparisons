package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_238 {
    private final Production42_238 production = new Production42_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}