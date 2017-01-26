package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_96 {
    private final Production53_96 production = new Production53_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}