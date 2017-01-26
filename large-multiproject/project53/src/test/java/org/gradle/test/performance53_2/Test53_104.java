package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_104 {
    private final Production53_104 production = new Production53_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}