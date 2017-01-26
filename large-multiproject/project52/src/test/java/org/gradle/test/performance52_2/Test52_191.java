package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_191 {
    private final Production52_191 production = new Production52_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}