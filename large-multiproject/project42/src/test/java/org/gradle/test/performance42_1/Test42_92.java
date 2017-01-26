package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_92 {
    private final Production42_92 production = new Production42_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}