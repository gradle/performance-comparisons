package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_282 {
    private final Production26_282 production = new Production26_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}