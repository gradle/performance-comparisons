package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_72 {
    private final Production53_72 production = new Production53_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}