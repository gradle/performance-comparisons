package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_147 {
    private final Production53_147 production = new Production53_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}