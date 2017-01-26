package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_189 {
    private final Production23_189 production = new Production23_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}