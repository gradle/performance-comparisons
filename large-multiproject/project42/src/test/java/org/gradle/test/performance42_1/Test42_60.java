package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_60 {
    private final Production42_60 production = new Production42_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}