package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_41 {
    private final Production26_41 production = new Production26_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}