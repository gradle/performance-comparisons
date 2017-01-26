package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_71 {
    private final Production29_71 production = new Production29_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}