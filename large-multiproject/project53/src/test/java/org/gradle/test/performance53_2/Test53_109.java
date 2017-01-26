package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_109 {
    private final Production53_109 production = new Production53_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}