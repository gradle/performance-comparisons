package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_67 {
    private final Production53_67 production = new Production53_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}