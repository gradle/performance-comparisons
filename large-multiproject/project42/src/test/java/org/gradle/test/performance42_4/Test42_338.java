package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_338 {
    private final Production42_338 production = new Production42_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}