package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_146 {
    private final Production34_146 production = new Production34_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}