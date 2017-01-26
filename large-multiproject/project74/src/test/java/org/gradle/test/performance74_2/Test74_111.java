package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_111 {
    private final Production74_111 production = new Production74_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}