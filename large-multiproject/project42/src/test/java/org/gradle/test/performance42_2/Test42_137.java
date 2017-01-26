package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_137 {
    private final Production42_137 production = new Production42_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}