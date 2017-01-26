package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_306 {
    private final Production53_306 production = new Production53_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}