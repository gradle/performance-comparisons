package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_82 {
    private final Production53_82 production = new Production53_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}