package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_158 {
    private final Production34_158 production = new Production34_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}