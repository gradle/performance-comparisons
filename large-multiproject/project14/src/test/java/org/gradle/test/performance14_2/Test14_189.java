package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_189 {
    private final Production14_189 production = new Production14_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}