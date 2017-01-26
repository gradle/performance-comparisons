package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_93 {
    private final Production53_93 production = new Production53_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}