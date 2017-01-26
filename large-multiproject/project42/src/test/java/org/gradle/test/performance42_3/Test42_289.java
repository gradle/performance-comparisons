package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_289 {
    private final Production42_289 production = new Production42_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}