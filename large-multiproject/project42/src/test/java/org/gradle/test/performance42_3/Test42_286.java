package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_286 {
    private final Production42_286 production = new Production42_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}