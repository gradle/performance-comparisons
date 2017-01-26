package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_264 {
    private final Production53_264 production = new Production53_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}