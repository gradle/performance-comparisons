package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43079 {
    private final Productionnull_43079 production = new Productionnull_43079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}