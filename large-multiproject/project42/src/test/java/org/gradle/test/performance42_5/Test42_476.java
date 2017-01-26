package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_476 {
    private final Production42_476 production = new Production42_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}