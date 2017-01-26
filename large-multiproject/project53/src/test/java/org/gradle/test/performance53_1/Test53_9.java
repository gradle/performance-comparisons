package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_9 {
    private final Production53_9 production = new Production53_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}