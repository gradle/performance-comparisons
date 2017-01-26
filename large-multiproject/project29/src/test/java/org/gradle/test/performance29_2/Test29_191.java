package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_191 {
    private final Production29_191 production = new Production29_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}