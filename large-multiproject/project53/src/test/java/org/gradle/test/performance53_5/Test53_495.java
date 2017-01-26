package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_495 {
    private final Production53_495 production = new Production53_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}