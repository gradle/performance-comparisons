package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_45 {
    private final Production26_45 production = new Production26_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}