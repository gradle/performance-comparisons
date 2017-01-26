package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_183 {
    private final Production42_183 production = new Production42_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}