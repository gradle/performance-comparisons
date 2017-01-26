package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_212 {
    private final Production53_212 production = new Production53_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}