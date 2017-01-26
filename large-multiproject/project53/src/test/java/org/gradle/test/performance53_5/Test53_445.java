package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_445 {
    private final Production53_445 production = new Production53_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}