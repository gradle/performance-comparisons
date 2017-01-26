package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42846 {
    private final Productionnull_42846 production = new Productionnull_42846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}