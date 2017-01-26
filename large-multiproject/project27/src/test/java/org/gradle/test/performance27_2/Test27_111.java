package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_111 {
    private final Production27_111 production = new Production27_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}