package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_255 {
    private final Production53_255 production = new Production53_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}