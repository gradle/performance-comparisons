package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_425 {
    private final Production53_425 production = new Production53_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}