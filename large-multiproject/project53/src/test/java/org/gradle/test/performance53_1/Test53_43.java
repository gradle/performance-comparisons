package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_43 {
    private final Production53_43 production = new Production53_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}