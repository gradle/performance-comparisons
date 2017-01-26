package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_166 {
    private final Production53_166 production = new Production53_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}