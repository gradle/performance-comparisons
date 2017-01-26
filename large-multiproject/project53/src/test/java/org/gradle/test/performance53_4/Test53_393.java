package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_393 {
    private final Production53_393 production = new Production53_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}