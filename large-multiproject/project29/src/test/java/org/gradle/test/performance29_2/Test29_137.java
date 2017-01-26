package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_137 {
    private final Production29_137 production = new Production29_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}