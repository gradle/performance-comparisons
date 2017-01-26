package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_302 {
    private final Production42_302 production = new Production42_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}