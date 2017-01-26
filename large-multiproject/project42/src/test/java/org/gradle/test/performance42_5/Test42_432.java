package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_432 {
    private final Production42_432 production = new Production42_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}