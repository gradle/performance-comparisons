package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_310 {
    private final Production42_310 production = new Production42_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}