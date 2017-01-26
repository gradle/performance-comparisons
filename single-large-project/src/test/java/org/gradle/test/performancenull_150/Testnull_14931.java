package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14931 {
    private final Productionnull_14931 production = new Productionnull_14931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}