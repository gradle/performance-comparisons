package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_202 {
    private final Production42_202 production = new Production42_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}