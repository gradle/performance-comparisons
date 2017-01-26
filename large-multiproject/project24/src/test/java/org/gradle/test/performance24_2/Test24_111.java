package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_111 {
    private final Production24_111 production = new Production24_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}