package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_373 {
    private final Production53_373 production = new Production53_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}