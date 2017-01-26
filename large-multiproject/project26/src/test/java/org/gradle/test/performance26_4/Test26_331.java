package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_331 {
    private final Production26_331 production = new Production26_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}