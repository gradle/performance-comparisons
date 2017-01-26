package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_252 {
    private final Production34_252 production = new Production34_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}