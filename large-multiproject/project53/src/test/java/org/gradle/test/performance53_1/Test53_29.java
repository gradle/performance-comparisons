package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_29 {
    private final Production53_29 production = new Production53_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}