package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_68 {
    private final Production26_68 production = new Production26_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}