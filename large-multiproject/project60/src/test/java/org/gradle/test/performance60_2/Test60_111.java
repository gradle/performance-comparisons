package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_111 {
    private final Production60_111 production = new Production60_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}