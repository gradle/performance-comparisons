package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_191 {
    private final Production53_191 production = new Production53_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}