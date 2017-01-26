package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_229 {
    private final Production53_229 production = new Production53_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}