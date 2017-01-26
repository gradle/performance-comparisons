package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_482 {
    private final Production42_482 production = new Production42_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}