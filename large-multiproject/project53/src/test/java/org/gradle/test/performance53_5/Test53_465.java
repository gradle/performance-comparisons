package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_465 {
    private final Production53_465 production = new Production53_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}