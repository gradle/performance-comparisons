package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_155 {
    private final Production53_155 production = new Production53_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}