package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_249 {
    private final Production42_249 production = new Production42_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}