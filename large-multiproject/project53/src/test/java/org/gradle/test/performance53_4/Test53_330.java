package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_330 {
    private final Production53_330 production = new Production53_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}