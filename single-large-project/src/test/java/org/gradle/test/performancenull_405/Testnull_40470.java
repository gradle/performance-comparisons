package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40470 {
    private final Productionnull_40470 production = new Productionnull_40470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}