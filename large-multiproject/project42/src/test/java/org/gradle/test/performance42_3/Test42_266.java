package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_266 {
    private final Production42_266 production = new Production42_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}