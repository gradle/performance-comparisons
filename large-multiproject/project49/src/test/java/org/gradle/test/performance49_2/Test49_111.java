package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_111 {
    private final Production49_111 production = new Production49_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}