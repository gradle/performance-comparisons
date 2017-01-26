package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_189 {
    private final Production36_189 production = new Production36_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}