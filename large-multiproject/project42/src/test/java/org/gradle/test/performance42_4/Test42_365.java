package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_365 {
    private final Production42_365 production = new Production42_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}