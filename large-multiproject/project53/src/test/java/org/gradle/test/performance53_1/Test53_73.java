package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_73 {
    private final Production53_73 production = new Production53_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}