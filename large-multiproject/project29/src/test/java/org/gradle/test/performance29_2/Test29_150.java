package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_150 {
    private final Production29_150 production = new Production29_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}