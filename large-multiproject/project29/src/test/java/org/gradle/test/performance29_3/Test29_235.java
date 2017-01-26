package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_235 {
    private final Production29_235 production = new Production29_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}