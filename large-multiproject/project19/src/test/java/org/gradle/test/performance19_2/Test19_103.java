package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_103 {
    private final Production19_103 production = new Production19_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}