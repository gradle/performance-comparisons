package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_92 {
    private final Production81_92 production = new Production81_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}