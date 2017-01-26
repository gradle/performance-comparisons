package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_444 {
    private final Production53_444 production = new Production53_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}