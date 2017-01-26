package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_111 {
    private final Production50_111 production = new Production50_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}