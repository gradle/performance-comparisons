package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_315 {
    private final Production53_315 production = new Production53_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}