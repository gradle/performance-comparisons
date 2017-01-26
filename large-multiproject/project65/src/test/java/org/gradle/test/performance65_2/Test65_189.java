package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_189 {
    private final Production65_189 production = new Production65_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}