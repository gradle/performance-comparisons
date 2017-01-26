package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_143 {
    private final Production34_143 production = new Production34_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}