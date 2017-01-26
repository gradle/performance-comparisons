package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42866 {
    private final Productionnull_42866 production = new Productionnull_42866("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}