package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_147 {
    private final Production29_147 production = new Production29_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}