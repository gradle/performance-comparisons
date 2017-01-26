package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_189 {
    private final Production91_189 production = new Production91_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}