package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_137 {
    private final Production53_137 production = new Production53_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}