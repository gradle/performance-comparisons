package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_111 {
    private final Production11_111 production = new Production11_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}