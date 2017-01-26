package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_242 {
    private final Production34_242 production = new Production34_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}