package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_353 {
    private final Production96_353 production = new Production96_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}