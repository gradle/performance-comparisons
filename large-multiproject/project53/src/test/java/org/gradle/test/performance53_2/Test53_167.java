package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_167 {
    private final Production53_167 production = new Production53_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}