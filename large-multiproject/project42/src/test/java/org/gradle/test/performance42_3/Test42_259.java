package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_259 {
    private final Production42_259 production = new Production42_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}