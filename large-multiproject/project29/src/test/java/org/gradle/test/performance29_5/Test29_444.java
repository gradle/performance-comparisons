package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_444 {
    private final Production29_444 production = new Production29_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}