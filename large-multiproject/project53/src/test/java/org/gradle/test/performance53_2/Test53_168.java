package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_168 {
    private final Production53_168 production = new Production53_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}