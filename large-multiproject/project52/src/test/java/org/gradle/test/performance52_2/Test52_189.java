package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_189 {
    private final Production52_189 production = new Production52_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}