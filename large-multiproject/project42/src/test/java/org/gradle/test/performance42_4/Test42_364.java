package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_364 {
    private final Production42_364 production = new Production42_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}