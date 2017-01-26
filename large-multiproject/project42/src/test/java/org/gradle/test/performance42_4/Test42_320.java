package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_320 {
    private final Production42_320 production = new Production42_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}