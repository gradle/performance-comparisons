package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_111 {
    private final Production81_111 production = new Production81_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}