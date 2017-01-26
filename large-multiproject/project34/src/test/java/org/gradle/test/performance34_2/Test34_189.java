package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_189 {
    private final Production34_189 production = new Production34_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}