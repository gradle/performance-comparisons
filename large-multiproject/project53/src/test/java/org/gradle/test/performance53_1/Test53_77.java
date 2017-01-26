package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_77 {
    private final Production53_77 production = new Production53_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}