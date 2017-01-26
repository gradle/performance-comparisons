package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_432 {
    private final Production29_432 production = new Production29_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}