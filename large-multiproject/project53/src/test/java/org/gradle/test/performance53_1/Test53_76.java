package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_76 {
    private final Production53_76 production = new Production53_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}