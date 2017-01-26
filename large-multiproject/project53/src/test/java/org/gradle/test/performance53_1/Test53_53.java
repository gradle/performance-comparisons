package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_53 {
    private final Production53_53 production = new Production53_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}