package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_222 {
    private final Production42_222 production = new Production42_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}