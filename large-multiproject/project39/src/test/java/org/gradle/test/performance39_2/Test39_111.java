package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_111 {
    private final Production39_111 production = new Production39_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}