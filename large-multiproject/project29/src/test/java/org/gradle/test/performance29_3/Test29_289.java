package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_289 {
    private final Production29_289 production = new Production29_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}