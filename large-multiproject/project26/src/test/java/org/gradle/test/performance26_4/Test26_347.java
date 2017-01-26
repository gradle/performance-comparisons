package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_347 {
    private final Production26_347 production = new Production26_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}