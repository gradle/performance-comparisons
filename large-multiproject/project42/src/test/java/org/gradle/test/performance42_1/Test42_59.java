package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_59 {
    private final Production42_59 production = new Production42_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}