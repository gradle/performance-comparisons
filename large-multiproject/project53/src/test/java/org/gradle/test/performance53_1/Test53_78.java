package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_78 {
    private final Production53_78 production = new Production53_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}