package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_289 {
    private final Production53_289 production = new Production53_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}