package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_189 {
    private final Production44_189 production = new Production44_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}