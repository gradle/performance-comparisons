package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_234 {
    private final Production96_234 production = new Production96_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}