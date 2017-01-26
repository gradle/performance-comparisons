package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_253 {
    private final Production42_253 production = new Production42_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}