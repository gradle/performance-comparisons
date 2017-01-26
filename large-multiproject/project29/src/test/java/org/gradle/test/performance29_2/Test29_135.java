package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_135 {
    private final Production29_135 production = new Production29_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}