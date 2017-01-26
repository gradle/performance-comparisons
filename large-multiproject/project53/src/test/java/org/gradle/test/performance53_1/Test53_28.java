package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_28 {
    private final Production53_28 production = new Production53_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}