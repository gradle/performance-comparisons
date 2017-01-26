package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_127 {
    private final Production29_127 production = new Production29_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}