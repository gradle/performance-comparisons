package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42016 {
    private final Productionnull_42016 production = new Productionnull_42016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}