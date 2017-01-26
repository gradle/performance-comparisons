package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_172 {
    private final Production53_172 production = new Production53_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}