package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_373 {
    private final Production34_373 production = new Production34_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}