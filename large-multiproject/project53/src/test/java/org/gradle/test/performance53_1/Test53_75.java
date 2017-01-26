package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_75 {
    private final Production53_75 production = new Production53_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}