package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_77 {
    private final Production26_77 production = new Production26_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}