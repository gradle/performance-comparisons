package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_468 {
    private final Production42_468 production = new Production42_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}