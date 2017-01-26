package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_189 {
    private final Production19_189 production = new Production19_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}