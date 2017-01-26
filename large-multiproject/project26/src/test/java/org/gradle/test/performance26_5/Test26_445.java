package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_445 {
    private final Production26_445 production = new Production26_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}