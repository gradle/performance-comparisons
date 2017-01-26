package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_282 {
    private final Production21_282 production = new Production21_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}