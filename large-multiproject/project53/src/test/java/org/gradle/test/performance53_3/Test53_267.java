package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_267 {
    private final Production53_267 production = new Production53_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}