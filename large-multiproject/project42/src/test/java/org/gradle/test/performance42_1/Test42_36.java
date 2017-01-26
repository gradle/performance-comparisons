package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_36 {
    private final Production42_36 production = new Production42_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}