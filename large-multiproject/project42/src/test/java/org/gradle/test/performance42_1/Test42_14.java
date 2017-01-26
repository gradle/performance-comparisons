package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_14 {
    private final Production42_14 production = new Production42_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}