package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_227 {
    private final Production45_227 production = new Production45_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}