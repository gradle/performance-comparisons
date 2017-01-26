package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_288 {
    private final Production53_288 production = new Production53_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}