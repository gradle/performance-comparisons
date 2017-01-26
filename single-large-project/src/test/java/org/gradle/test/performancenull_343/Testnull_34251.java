package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34251 {
    private final Productionnull_34251 production = new Productionnull_34251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}