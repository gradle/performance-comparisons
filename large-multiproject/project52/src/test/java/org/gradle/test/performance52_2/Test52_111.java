package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_111 {
    private final Production52_111 production = new Production52_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}