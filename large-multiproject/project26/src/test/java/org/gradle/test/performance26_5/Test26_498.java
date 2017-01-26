package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_498 {
    private final Production26_498 production = new Production26_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}