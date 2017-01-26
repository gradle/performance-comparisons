package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_395 {
    private final Production29_395 production = new Production29_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}