package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_173 {
    private final Production23_173 production = new Production23_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}