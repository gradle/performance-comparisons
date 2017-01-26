package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_282 {
    private final Production96_282 production = new Production96_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}