package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_219 {
    private final Production34_219 production = new Production34_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}