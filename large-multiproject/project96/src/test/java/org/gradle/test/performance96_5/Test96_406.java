package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_406 {
    private final Production96_406 production = new Production96_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}