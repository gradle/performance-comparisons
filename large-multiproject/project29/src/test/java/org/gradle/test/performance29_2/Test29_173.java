package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_173 {
    private final Production29_173 production = new Production29_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}