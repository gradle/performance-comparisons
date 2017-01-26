package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_406 {
    private final Production53_406 production = new Production53_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}