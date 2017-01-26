package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_80 {
    private final Production53_80 production = new Production53_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}