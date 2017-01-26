package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_230 {
    private final Production34_230 production = new Production34_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}