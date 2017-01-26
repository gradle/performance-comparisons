package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_259 {
    private final Production34_259 production = new Production34_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}