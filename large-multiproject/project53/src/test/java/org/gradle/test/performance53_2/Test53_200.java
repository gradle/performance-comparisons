package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_200 {
    private final Production53_200 production = new Production53_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}