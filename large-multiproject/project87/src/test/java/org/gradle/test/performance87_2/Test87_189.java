package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_189 {
    private final Production87_189 production = new Production87_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}