package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_498 {
    private final Production53_498 production = new Production53_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}