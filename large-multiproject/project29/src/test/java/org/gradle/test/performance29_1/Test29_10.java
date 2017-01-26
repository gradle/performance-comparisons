package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_10 {
    private final Production29_10 production = new Production29_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}