package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_196 {
    private final Production42_196 production = new Production42_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}