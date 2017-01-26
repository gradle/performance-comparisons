package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42663 {
    private final Productionnull_42663 production = new Productionnull_42663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}