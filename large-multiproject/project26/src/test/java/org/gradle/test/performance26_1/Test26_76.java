package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_76 {
    private final Production26_76 production = new Production26_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}