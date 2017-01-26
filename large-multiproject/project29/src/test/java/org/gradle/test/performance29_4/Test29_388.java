package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_388 {
    private final Production29_388 production = new Production29_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}