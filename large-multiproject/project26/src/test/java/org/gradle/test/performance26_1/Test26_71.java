package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_71 {
    private final Production26_71 production = new Production26_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}