package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_100 {
    private final Production29_100 production = new Production29_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}