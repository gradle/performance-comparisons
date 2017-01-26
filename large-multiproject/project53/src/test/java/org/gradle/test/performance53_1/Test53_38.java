package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_38 {
    private final Production53_38 production = new Production53_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}