package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_111 {
    private final Production15_111 production = new Production15_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}