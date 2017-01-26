package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_360 {
    private final Production42_360 production = new Production42_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}