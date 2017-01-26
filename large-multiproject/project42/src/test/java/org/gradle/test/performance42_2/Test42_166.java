package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_166 {
    private final Production42_166 production = new Production42_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}