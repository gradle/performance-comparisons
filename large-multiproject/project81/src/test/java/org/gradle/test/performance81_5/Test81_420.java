package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_420 {
    private final Production81_420 production = new Production81_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}