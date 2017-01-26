package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_231 {
    private final Production53_231 production = new Production53_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}