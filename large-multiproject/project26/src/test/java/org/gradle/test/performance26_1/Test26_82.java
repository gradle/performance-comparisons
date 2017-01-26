package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_82 {
    private final Production26_82 production = new Production26_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}