package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_200 {
    private final Production29_200 production = new Production29_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}