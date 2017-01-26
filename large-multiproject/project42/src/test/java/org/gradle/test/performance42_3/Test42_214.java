package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_214 {
    private final Production42_214 production = new Production42_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}