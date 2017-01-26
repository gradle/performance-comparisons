package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_111 {
    private final Production99_111 production = new Production99_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}