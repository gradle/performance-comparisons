package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_427 {
    private final Production53_427 production = new Production53_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}