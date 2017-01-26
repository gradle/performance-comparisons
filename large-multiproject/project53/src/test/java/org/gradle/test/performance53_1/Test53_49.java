package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_49 {
    private final Production53_49 production = new Production53_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}