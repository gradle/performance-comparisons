package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_145 {
    private final Production42_145 production = new Production42_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}