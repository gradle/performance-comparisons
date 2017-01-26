package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_61 {
    private final Production53_61 production = new Production53_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}