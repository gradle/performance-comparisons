package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_244 {
    private final Production34_244 production = new Production34_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}