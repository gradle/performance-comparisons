package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_162 {
    private final Production29_162 production = new Production29_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}