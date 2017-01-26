package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_189 {
    private final Production53_189 production = new Production53_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}