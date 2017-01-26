package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_269 {
    private final Production21_269 production = new Production21_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}