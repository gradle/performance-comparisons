package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_189 {
    private final Production45_189 production = new Production45_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}