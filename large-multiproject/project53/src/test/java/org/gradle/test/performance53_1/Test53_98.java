package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_98 {
    private final Production53_98 production = new Production53_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}