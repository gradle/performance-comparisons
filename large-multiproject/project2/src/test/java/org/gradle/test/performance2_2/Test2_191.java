package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_191 {
    private final Production2_191 production = new Production2_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}