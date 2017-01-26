package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_173 {
    private final Production42_173 production = new Production42_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}