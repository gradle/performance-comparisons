package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_40 {
    private final Production53_40 production = new Production53_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}