package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_107 {
    private final Production29_107 production = new Production29_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}