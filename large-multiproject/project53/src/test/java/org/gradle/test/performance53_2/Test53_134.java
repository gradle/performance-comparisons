package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_134 {
    private final Production53_134 production = new Production53_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}