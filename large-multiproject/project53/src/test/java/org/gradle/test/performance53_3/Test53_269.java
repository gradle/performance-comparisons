package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_269 {
    private final Production53_269 production = new Production53_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}