package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_112 {
    private final Production53_112 production = new Production53_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}