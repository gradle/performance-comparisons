package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_331 {
    private final Production53_331 production = new Production53_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}