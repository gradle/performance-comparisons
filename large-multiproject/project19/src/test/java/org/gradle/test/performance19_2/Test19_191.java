package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_191 {
    private final Production19_191 production = new Production19_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}