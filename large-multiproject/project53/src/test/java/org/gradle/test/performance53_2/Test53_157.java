package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_157 {
    private final Production53_157 production = new Production53_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}