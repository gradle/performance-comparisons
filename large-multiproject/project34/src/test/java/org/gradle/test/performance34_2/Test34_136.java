package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_136 {
    private final Production34_136 production = new Production34_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}