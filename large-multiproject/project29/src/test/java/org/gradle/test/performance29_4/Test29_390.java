package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_390 {
    private final Production29_390 production = new Production29_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}