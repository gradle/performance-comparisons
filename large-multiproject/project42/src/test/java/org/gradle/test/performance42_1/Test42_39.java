package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_39 {
    private final Production42_39 production = new Production42_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}