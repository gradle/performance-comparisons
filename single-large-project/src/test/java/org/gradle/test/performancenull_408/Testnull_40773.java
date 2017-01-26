package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40773 {
    private final Productionnull_40773 production = new Productionnull_40773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}