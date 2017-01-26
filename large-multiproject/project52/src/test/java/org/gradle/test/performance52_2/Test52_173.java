package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_173 {
    private final Production52_173 production = new Production52_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}