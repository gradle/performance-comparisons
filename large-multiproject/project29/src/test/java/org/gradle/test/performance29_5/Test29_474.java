package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_474 {
    private final Production29_474 production = new Production29_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}