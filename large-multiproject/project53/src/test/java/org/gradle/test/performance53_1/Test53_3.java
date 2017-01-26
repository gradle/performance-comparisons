package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_3 {
    private final Production53_3 production = new Production53_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}