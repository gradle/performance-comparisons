package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_109 {
    private final Production29_109 production = new Production29_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}