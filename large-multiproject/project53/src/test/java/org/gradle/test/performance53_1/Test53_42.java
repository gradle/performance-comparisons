package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_42 {
    private final Production53_42 production = new Production53_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}