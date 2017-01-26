package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_243 {
    private final Production42_243 production = new Production42_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}