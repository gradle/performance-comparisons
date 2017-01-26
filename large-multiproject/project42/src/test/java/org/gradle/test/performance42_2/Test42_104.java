package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_104 {
    private final Production42_104 production = new Production42_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}