package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_199 {
    private final Production53_199 production = new Production53_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}