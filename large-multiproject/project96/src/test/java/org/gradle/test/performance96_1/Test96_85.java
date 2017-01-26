package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_85 {
    private final Production96_85 production = new Production96_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}