package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_74 {
    private final Production42_74 production = new Production42_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}