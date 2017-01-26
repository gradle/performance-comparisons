package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_163 {
    private final Production42_163 production = new Production42_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}