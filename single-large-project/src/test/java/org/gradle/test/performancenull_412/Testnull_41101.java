package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41101 {
    private final Productionnull_41101 production = new Productionnull_41101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}