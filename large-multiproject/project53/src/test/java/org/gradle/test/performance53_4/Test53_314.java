package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_314 {
    private final Production53_314 production = new Production53_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}