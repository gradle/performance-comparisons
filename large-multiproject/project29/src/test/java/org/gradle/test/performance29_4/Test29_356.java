package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_356 {
    private final Production29_356 production = new Production29_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}