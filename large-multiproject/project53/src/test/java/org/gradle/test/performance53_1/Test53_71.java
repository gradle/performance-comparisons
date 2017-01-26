package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_71 {
    private final Production53_71 production = new Production53_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}