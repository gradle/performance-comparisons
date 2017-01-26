package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_325 {
    private final Production53_325 production = new Production53_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}