package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_126 {
    private final Production53_126 production = new Production53_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}