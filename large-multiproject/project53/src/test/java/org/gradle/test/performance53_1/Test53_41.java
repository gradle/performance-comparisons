package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_41 {
    private final Production53_41 production = new Production53_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}