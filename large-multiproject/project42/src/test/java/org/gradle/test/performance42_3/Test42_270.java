package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_270 {
    private final Production42_270 production = new Production42_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}