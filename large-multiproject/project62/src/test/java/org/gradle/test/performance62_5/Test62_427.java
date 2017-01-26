package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_427 {
    private final Production62_427 production = new Production62_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}