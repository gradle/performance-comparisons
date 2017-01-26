package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_163 {
    private final Production29_163 production = new Production29_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}