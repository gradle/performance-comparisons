package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_189 {
    private final Production2_189 production = new Production2_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}