package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_111 {
    private final Production38_111 production = new Production38_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}