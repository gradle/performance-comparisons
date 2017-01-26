package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_111 {
    private final Production53_111 production = new Production53_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}