package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_220 {
    private final Production34_220 production = new Production34_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}